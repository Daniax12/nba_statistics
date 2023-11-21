// import React, { useState, useEffect } from 'react';
import '../css/bootstrap.min.css';
import '../css/style.css';

function Header() { // The empty dependency array indicates that this effect should run only when the component mounts
    return (
          <div className='container'>
        
        
            <div className="site-mobile-menu site-navbar-target">
              <div className="site-mobile-menu-header">
                <div className="site-mobile-menu-close mt-3">
                  <span className="icon-close2 js-menu-toggle"></span>
                </div>
              </div>
              <div className="site-mobile-menu-body"></div>
            </div> 
            
            
            <div className="site-navbar-wrap">
              <div className="site-navbar-top">
                <div className="container py-3">
                  <div className="row align-items-center">
                    <div className="col-6">
                      <div className="d-flex mr-auto">
                        <a href="#" className="d-flex align-items-center mr-4">
                          <span className="icon-envelope mr-2"></span>
                          <span className="d-none d-md-inline-block">1757-18230-1864</span>
                        </a>
                        <a href="#" className="d-flex align-items-center mr-auto">
                          <span className="icon-phone mr-2"></span>
                          <span className="d-none d-md-inline-block">PROJET S5</span>
                        </a>
                      </div>
                    </div>
                    <div className="col-6 text-right">
                      <div className="mr-auto">
                        <a href="#" className="p-2 pl-0"><span className="icon-twitter"></span></a>
                        <a href="#" className="p-2 pl-0"><span className="icon-facebook"></span></a>
                        <a href="#" className="p-2 pl-0"><span className="icon-linkedin"></span></a>
                        <a href="#" className="p-2 pl-0"><span className="icon-instagram"></span></a>
                      </div>
                      
                    </div>
                  </div>
                </div>
              </div>
        
              <div className="site-navbar site-navbar-target js-sticky-header">
                <div className="container">
                  <div className="row align-items-center">
                    <div className="col-2">
                      <h1 className="my-0 site-logo"><a href="index.html">NBA Statistics</a></h1>
                    </div>
                    <div className="col-10">
                      <nav className="site-navigation text-right" role="navigation">
                        <div className="container">
                          <div className="d-inline-block d-lg-none ml-md-0 mr-auto py-3"><a href="#" className="site-menu-toggle js-menu-toggle text-white"><span className="icon-menu h3"></span></a></div>
        
                          <ul className="site-menu main-menu js-clone-nav d-none d-lg-block">
                            <li className="active"><a href="#home-section" className="nav-link">Home</a></li>
                            <li><a href="#classNamees-section" className="nav-link">ClassNaclassNamees</a></li>
                            <li className="has-children">
                              <a href="#" className="nav-link">Pages</a>
                              <ul className="dropdown arrow-top">
                                <li><a href="#" className="nav-link">Team</a></li>
                                <li><a href="#" className="nav-link">Pricing</a></li>
                                <li><a href="#" className="nav-link">FAQ</a></li>
                                <li className="has-children">
                                  <a href="#">More Links</a>
                                  <ul className="dropdown">
                                    <li><a href="#">Menu One</a></li>
                                    <li><a href="#">Menu Two</a></li>
                                    <li><a href="#">Menu Three</a></li>
                                  </ul>
                                </li>
                              </ul>
                            </li>
                            <li><a href="#about-section" className="nav-link">About</a></li>
                            <li><a href="#events-section" className="nav-link">Events</a></li>
                            <li><a href="#gallery-section" className="nav-link">Gallery</a></li>
                            <li><a href="#contact-section" className="nav-link">Contact</a></li>
                          </ul>
                        </div>
                      </nav>
                    </div>
                  </div>
                </div>
              </div>
            </div>
        
          </div>
    );
}

export default Header;