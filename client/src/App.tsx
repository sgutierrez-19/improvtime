import React from "react";
import logo from "./logo.svg";
import "./App.css";
import { Container } from "reactstrap";
import { MainPage } from "./components/MainPage";
import { Footer } from "./components/Footer";
import { NavbarComp } from "./components/NavbarComp";

function App() {
  return (
    <Container>
      <NavbarComp />
      <MainPage />
      <Footer />
    </Container>
  );
}

export default App;
