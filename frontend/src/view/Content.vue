<template>
    <div class='box'>
        <div class='classNavigation'>
            <b>classNavigation</b>
        </div>
        <div class='contents'>
            <b>contents</b>
        </div>
    </div>
</template>

<script>
export default {

}
</script>

<style scopped>

    .box {
        border: 1px solid darkcyan;
        margin: 0 auto;
        margin-top: 50px;
        margin-bottom: 50px;
        position: relative;
        /* float: left; */
        /* display: flex; */
        width: 95%;
        min-width: 1400px;
    }

    .classNavigation {
        border: 1px solid black;
        position: fixed;
        display: table-cell;
        margin: 30px;
        width: 300px;
        height: 500px;
    }
    .contents {
        border: 1px solid burlywood;
        position: absolute;
        display: table-cell;
        margin-left: 400px;
        margin-top: 30px;
        width: 70%;
        min-width: 800px; 
        height: 1000px;
    }

</style>
