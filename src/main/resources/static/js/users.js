$(document).ready(function () {

    createBootstrapTable();

});

function createBootstrapTable(){

    $('#usersTable').bootstrapTable({
        url: 'usersTable',
        columns: [{
            field: 'id',
            title: 'ID',
            sortable: true

        }, {
            field: 'name',
            title: 'Name',
            sortable: true
        }, {
            field: 'surname',
            title: 'Surname',
            sortable: true
        }, {
            field: 'email',
            title: 'E-mail',
            sortable: true
        }, {
            field: 'phone',
            title: 'Phone',
            sortable: true
        }, {
            field: 'registerDate',
            title: 'Register Date',
            sortable: true
        }, {
            field: 'isEnabled',
            title: 'Is Enabled',
            sortable: true
        }, {
            field: 'password',
            title: 'Password',
            sortable: true
        }, ]
    });

    $('#usersContainer').show();

}