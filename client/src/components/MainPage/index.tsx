import React from "react";
import { getPrompt } from "../../api/improv";

export class MainPage extends React.Component<any, any> {
  async componentDidMount() {
    let something = await getPrompt();
    console.log(something);
  }
  render() {
    return <>MAIN</>;
  }
}
