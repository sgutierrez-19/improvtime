import { server } from "./server";

export async function getPrompt() {
  try {
    return await server.get("/improv");
  } catch (error) {
    console.log(error);
  }
}
