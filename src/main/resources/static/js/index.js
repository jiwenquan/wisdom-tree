$(function() {
    var $ulnavigation = $("#ulnavigation");
    var $divhomepage = $("#divhomepage");
    var $divmainappelement = $("#divmainappelement");
    var $aelementconfig = $("#aelementconfig");
    var $divmodular = $("#divmodular");

    $divhomepage.load('projectmanage/homepage.html');
    $divmainappelement.load('projectmanage/appElement.html');
    // $aelementconfig.click(function() {
    //     $ulnavigation.find('li').removeClass('active');
    //     $(this).parent().addClass('active');
    //     $divhomepage.hide();
    //     $divmainappelement.show();
    // });

    $(".mainhead").on('click', 'a', function() {
        var $this = $(this);
        if ($this.html() == "首页") {
            $ulnavigation.find('li').removeClass('active');
            $this.parent().addClass('active');
            $divmodular.children().hide();
            $divhomepage.show();
        } else if ($this.html() == "APP元素配置") {
            $ulnavigation.find('li').removeClass('active');
            $this.parent().addClass('active');
            $divmodular.children().hide();
            $divmainappelement.show();
        }
    })
})