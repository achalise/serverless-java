import { Response, Request } from "express";
import Transaction from "../models/transaction";
import { saveTransaction } from "../db-services/transaction-service";

const postTransaction = async (req: Request, res: Response) => {
    const transaction = req.body as Transaction;
    console.log(`Saving transaction from req `, transaction);
    const savedTransaction = await saveTransaction(transaction);

    res.status(200).json({ message: `Successfully saved transaction ${savedTransaction.id}` });
}

export default postTransaction;