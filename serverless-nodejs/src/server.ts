import * as http from 'http';
import app from './app';

let port = process.env.PORT || 7000;

const server: http.Server = app.listen(port, () => {
    console.log(`Server started at port: ${port}`);
});

export default server;