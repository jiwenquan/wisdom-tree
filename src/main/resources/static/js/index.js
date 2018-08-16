$(function() {
    var $ulnavigation = $("#ulnavigation");
    var $divhomepage = $("#divhomepage");
    var $divmainappelement = $("#divmainappelement");
    var $aelementconfig = $("#aelementconfig");

    $divhomepage.load('projectmanage/homepage.html');
    $divmainappelement.load('projectmanage/appElement.html');
    $aelementconfig.click(function() {
        $ulnavigation.find('li').removeClass('active');
        $(this).parent().addClass('active');
        $divhomepage.hide();
        $divmainappelement.show();
    });


})