export class Quantity {
    id: number;
    quantity: number;
    comment: string;
    product_id: number;
    depository_id: number;

   /* constructor(id?: number, quantity?: number, comment?: string, product_id?: number, depository_id?: number) {
        this.id = id;
        this.quantity = quantity;
        this.comment = comment;
        this.product_id = product_id;
        this.depository_id = depository_id;
    }*/

    constructor(quantity?: number, comment?: string, product_id?: number, depository_id?: number) {
        this.quantity = quantity;
        this.comment = comment;
        this.product_id = product_id;
        this.depository_id = depository_id;
    }
}
