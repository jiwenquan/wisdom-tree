$(function() {

    var lang = {
        'sProcessing': '加载中...',
        'sZeroRecords': '没有找到要查询的数据',
        'sInfo': '当前显示第 _START_ 至 _END_ 项，共 _TOTAL_ 项',
        'sInfoEmpty': '当前显示第 0 至 0 项，共 0 项',
        'oPaginate': {
            'sFirst':'首页',
            'sPrevious':'上页',
            'sNext':'下页',
            'sLast':'末页'
        }
    };

    var $tblAppWelcomeImgConfig = $("#tblAppWelcomeImgConfig").DataTable({
        'language': lang,
        'serverSide': true,
        'paging': true,
        'pagingType' : 'simple_numbers',
        'stripeClasses': ["none", "none"],
        'pageLength': 10,
        'bLengthChange': false,
        'ordering': false,
        'bInfo': false,
        'stateSave': false,
        'processing': true,
        'bFilter': false,
        'searching': false,
        'ordering': true,
        'order':[[ 0, "desc" ]],
        'ajax': {
            'type': 'POST',
            'cache': false,
            'url' : '/app/manage/welcome/pageAll',
            'data': function(params) {

            },
            'dataType': 'json'
        },
        'drawCallback': function(setting) {

        },
        'columns': [
            { 'title': '主题', 'target': 1, 'width': '20%', 'orderable': false, 'data': 'summary'
            },
            { 'title': '图片路径', 'target': 2, 'data': 'imgPath', 'orderable': false, 'width': '15%' },
            { 'title': '是否有效', 'target': 3, 'data': 'delFlagText', 'orderable': false, 'width': '10%' },
            { 'title': '创建日期', 'target': 4, 'data': 'created', 'width': '15%' },
            { 'title': '更新日期', 'target': 5, 'data': 'updated', 'width': '15%' },
            { 'title': '操作', 'target': 6, 'orderable': false, 'data': function(item) {
                    var str = '<div class="btn-group"><button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><img src="../images/more.png"/></button><ul class="dropdown-menu">';
                    var menubtn = '<li><a href="javascript:void(0);" class="edit btn-edit-sm" >编辑</a></li><li><a href="javascript:void(0);" class="delete btn-delete-sm">删除</a></li>';
                    return str + menubtn + '</ul></div>';
                }, 'width': '10%'}
        ]
    });
});