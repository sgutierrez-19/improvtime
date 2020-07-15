import React from "react";
import logo from "./logo.svg";
import "./App.css";
import { Container } from "reactstrap";

function App() {
  return (
    <Container>
      <NavBar />
      <MainPage />
      <Footer />
    </Container>
  );
}

export default App;
