import React, { useState, useEffect } from 'react';
import axios from 'axios';
// import JoueurService from '../services/JoueurService';
import '../css/bootstrap.min.css';
import '../css/stylelist.css';
function ListeJoueur() {


  const [playerData, setPlayerData] = useState([]);

  useEffect(() => {
    axios.get('https://catfact.ninja/fact')
      .then(response => setPlayerData([response.data]))
      .catch(error => console.error('Error fetching data:', error));
  }, []);// The empty dependency array indicates that this effect should run only when the component mounts
    return (
  <div>
  

  <div class="content">
    
    <div class="container">
      

      <div class="table-responsive">

        <table class="table table-striped custom-table">
          <thead>
        


            <tr>
            
              <th scope="col">Order</th>
              <th scope="col">Player</th>
              <th scope="col">Team</th>
              <th scope="col">M</th>
              <th scope="col">MJ</th>
              <th scope="col">PPM</th>
              <th scope="col">RPM</th>
              <th scope="col">PDPM</th>
              <th scope="col">MPM</th>
              <th scope="col">EFF</th>
              <th scope="col">FG%</th>
              <th scope="col">3P%</th>
              <th scope="col">%LF</th>
              <th scope="col">DÉSACTIVÉ</th>
              <th scope="col">DÉF</th>
              <th scope="col">IPM</th>
              <th scope="col">CPM</th>
              <th scope="col">BP</th>
              <th scope="col">FP</th>
            </tr>
          
          </thead>
          <tbody>
          {playerData.map((joueur) => (
            <tr >   
                     <td>{joueur.fact}</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
                     <td>Option</td>
            
            </tr>
            ))}
          </tbody>
        </table>
      </div>


    </div>

  </div>
  </div>
    );
}

export default ListeJoueur;