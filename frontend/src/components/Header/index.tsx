import logo from '../../assets/img/logo.svg';
import './styles.css';

function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>GVNMeta</h1>
                <p>
                    Desenvolvido por
                    <a href="https://www.linkedin.com/in/giovanni-rios-barros-a2503918b/"> @gvnrb</a>
                </p>
            </div>
        </header>
    )
}

export default Header;
