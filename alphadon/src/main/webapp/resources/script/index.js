/**
 * Created by liuhaidong on 16/7/26.
 */
$(function () {
   $("#feaCtr").bootstrapTable({
       method: 'get',
       url: '/feaCtr',
       cache: false,
       height: 400,
       striped: true,
       pagination: true,
       pageSize: 50,
       pageList: [10, 25, 50, 100, 200],
       search: true,
       showColumns: true,
       showRefresh: true,
       minimumCountColumns: 2,
       clickToSelect: true,
       columns: [
           { field: 'state',
               checkbox: true
           },
           {
               field: 'id',
               title: 'Item ID',
               align: 'right',
               valign: 'bottom',
               sortable: true
           },
           {
               field: 'name',
               title: 'Item Name',
               align: 'center',
               valign: 'middle',
               sortable: true,
           },
           {
               field: 'price',
               title: 'Item Price',
               align: 'left',
               valign: 'top',
               sortable: true
           },
           {
               field: 'operate',
               title: 'Item Operate',
               align: 'center',
               valign: 'middle',
               clickToSelect: false,
               formatter: function (value, row) {
               },
               events: {
                   'click a': function (e, value, row, index) {
                   }
               }
           }
       ]
   });

})