$(document).ready(function () {

    createBootstrapTable();

    $("#submitUpload").click(function (event) {
        event.preventDefault();
        fireAjaxFileUpload();
    });

    $("#submitClassSelection").click(function (event) {
        event.preventDefault();
        setSelectedClasses();
    });

});

function fireAjaxFileUpload() {

    var form = $('#fileUploadForm')[0];
    var data = new FormData(form);

    $.ajax({
        type: "POST",
        enctype: 'multipart/form-data',
        url: "upload",
        data: data,
        processData: false,
        contentType: false,
        cache: false,
        timeout: 600000,
        datatype: "json",
        success: function (data) {

            $('#fileUploadForm').hide();

            createBootstrapTable();

        }
    });

}

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

function setSelectedClasses() {

    activeClasses = getSelectedClasses();

    $.ajax( {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        type: 'POST',
        url: '/setSelectedClasses',
        data: JSON.stringify(activeClasses),
        datatype: "json",
        success: function(data) {

            $('#classesSelectionContainer').hide();

            createClassesData(data);
            $('#classesCards').find('.carousel-item').first().addClass('active');
            $('#classesContainer').show();
        }
    });

}

function getSelectedClasses(){
    selectedClasses = $('#selectClassesTable').bootstrapTable('getSelections');
    return selectedClasses;
}