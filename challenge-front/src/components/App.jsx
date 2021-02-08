import React from 'react';
import { Redirect, Route, Switch, useHistory } from 'react-router-dom';
import logo from '../assets/logo.svg';
import AccountList from './AccountList';

export default function App() {
  const history = useHistory();

  return (
    <div>
      <header>
        <img src={logo} alt="logo" onClick={() => history.push('/')} />
      </header>

      <main className="container">
        <Switch>
          <Route exact path="/accounts" component={AccountList} />
          <Redirect exact from="/" to="/accounts" />
        </Switch>
      </main>
    </div>
  );
}
