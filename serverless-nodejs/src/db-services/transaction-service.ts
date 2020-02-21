import Transaction from "../models/transaction";


export const saveTransaction = async (transaction: Transaction): Promise<Transaction> => {
    console.log(`Saved transaction `, transaction);
    transaction.id = "111222333";
    return transaction;
}
