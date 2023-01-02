import React from "react";
import ProductsService from "./services/ProductsService";


class ProductsComponent extends React.Component {

    constructor(props){
        super(props)
        this.state = {
            products:[]
        }
    }

    componentDidMount(){
        ProductsService.getProducts().then((response) => {
            this.setState({ products: response.data})
        });
    }

    render (){
        return (
            <div>
                <h1 className="text-center">Products List</h1>
                <table className="table table-striped">
                    <thead> 
                        <tr>
                            <td>Id Product</td>
                            <td>Name</td>
                            <td>Description</td>
                            <td>In Stock</td>

                        </tr>
                    </thead>
                    <tbody>
                        {

                            this.state.products.map(
                                products =>
                                <tr key = {products.id}>
                                    <td>{products.id}</td>
                                    <td>{products.name}</td>
                                    <td>{products.description}</td>
                                    <td>{products.stock}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
    }

}

export default ProductsComponent