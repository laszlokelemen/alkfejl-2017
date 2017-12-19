export class Storage {
    id: number;
    name: string;
    color: string;
    size: string;
    price: number;

    constructor(name?: string, color?: string, size?: string, price?: number) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;

    }/*
    constructor(name?: string, color?: string, size?: string, price?: number, id?: number) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;

    }*/


}
