<template>
    <div class='box'>
        <div class='wrap_content'>
            <div id='classNavigation'>
                <b>ClassNavigation</b>
            </div>
            <div class='contents'>
                <b>Contents</b>
            </div>
        </div>
    </div>
</template>

<script src="https://code.jquery.com/jquery-3.2.1.js"></script>
<script>
export default {

}
</script>

<style scopped>
    b {
        font-size: 2em;
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
</style>
