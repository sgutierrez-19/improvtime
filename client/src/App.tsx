import React from "react";
import logo from "./logo.svg";
import "./App.css";
import { Container } from "reactstrap";
import { MainPage } from "./components/MainPage";
import { Footer } from "./components/Footer";
import { NavbarComp } from "./components/NavbarComp";

function App() {
  return (
    <>
      <NavbarComp />
      <Container className="main-container">
        <MainPage />
      </Container>
      <Footer />
    </>
  );
}

export default App;
