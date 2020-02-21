import Transaction from "./models/transaction";
import { saveTransaction } from "./db-services/transaction-service";

export const handler = async (event: Transaction): Promise<any> => {
    console.log('Saving transaction: ', event);
    let savedTransaction = saveTransaction(event);
    return savedTransaction;
}