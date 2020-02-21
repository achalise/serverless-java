import express from 'express';
import saveTransaction from './controllers/transaction-controller';
import bodyParser = require('body-parser');

const app: express.Application = express();

app.use(bodyParser.json());

app.use("/", express.static("public"));
app.post(`/transactions`, saveTransaction);

export default app;