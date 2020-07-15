import React from "react";
import { Navbar, NavbarBrand } from "reactstrap";

export class NavbarComp extends React.Component<any, any> {
  render() {
    return (
      <Navbar color="light" light expand="md">
        <NavbarBrand href="/">Improv-Time</NavbarBrand>
      </Navbar>
    );
  }
}
