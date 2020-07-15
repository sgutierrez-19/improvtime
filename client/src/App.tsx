import React from "react";
import logo from "./logo.svg";
import "./App.css";
import { Container, Navbar } from "reactstrap";
import { MainPage } from "./components/MainPage";
import { Footer } from "./components/Footer";

function App() {
  return (
    <Container>
      <Navbar />
      <MainPage />
      <Footer />
    </Container>
  );
}

export default App;
