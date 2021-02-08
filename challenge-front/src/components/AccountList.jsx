import React from 'react';

export default function AccountList() {
  return (
    <div>
      <h1>Account List</h1>

      <br />

      <table className="table table-bordered">
        <thead>
          <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Balance</th>
            <th>Currency</th>
            <th>Type</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th>1000001</th>
            <td>Compte Courant</td>
            <td>350.99</td>
            <td>EUR</td>
            <td>checking</td>
            <td>
              <a href="">view</a>
            </td>
          </tr>
          <tr>
            <th>1000002</th>
            <td>Livret A</td>
            <td>1200</td>
            <td>EUR</td>
            <td>saving</td>
            <td>
              <a href="">view</a>
            </td>
          </tr>
          <tr>
            <th>1000003</th>
            <td>Pret Etudiant</td>
            <td>15000</td>
            <td>EUR</td>
            <td>loan</td>
            <td>
              <a href="">view</a>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}
