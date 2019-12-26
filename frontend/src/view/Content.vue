<template>
    <div class='box'>
        <div class='header'>
            <b>Header</b>
        </div>
        <div class='wrap_content'>
            <div id='classNavigation'>
                <b>ClassNavigation</b>
            </div>
            <div class='contents'>
                <b>Contents</b>
            </div>
        </div>
        <div class='footer'>
            <b>Footer</b>
        </div>
    </div>
</template>

<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script>
export default {

}
var body = document.body
var html = document.documentElement;

var height = body.scrollHeight;

// $(window).scroll(

// );

</script>

<style scopped>
    b {
        font-size: 2em;
    }
    .header {
        height: 300px;
        border: 2px dash darksalmon;
        background-color: yellowgreen;
        margin-bottom: 50px;
    }
    .wrap_content {
        overflow: hidden;
        border: 1px solid darkcyan;
        width: 65%;
        min-width: 1200px;
        margin: 0 auto;
    }
    #classNavigation {
        border: 1px solid rosybrown;
        float: left;
        width: 300px;
        /* min-width: 250px; */
        height: 500px;
        position: fixed;
    }
    .contents {
        border: 1px solid gray;
        float: right;
        width: 75%;
        height: 1000px;
    }

    .footer {
        height: 200px;
        background-color: bisque;
        margin-top: 40px;
    }

    /* .wrap_content {
        overflow: hidden;
        border: 1px solid darkcyan;
        margin: 0 auto;
        margin-top: 50px;
        margin-bottom: 50px;
        display:table;
        //position: static;
        text-align: left;
        width: 65%;
        min-width: 1400px;
        // flex-wrap: wrap;
    }

    .classNavigation {
        border: 1px solid black;
        position: fixed;
        display: table-row;
        // display: inline-block;
        margin: 30px 30px 0px 0px;
        width: 280px;
        height: 500px;
    }
    .contents {
        border: 1px solid burlywood;
        position: absolute;
        display: table-row;
        // display: inline-block;
        margin-left: 310px;
        margin-top: 30px;
        width: 70%;
        min-width: 750px;
        height: 1000px;
    }

    .footer {
        width: 100%;
        height: 300px;
        background-color: beige;
        // position: static;
    } */

</style>
