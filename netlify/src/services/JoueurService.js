import axios from 'axios';
const EMPLOYEE_API_BASE_URL = 'https://www.boredapi.com/api/activity';
class JoueurService {
    getJoueurs(){
        return axios.get(EMPLOYEE_API_BASE_URL)
        .catch(error=>error);
    }
}
export default new JoueurService();