$(document).ready(function() {
    $('#businessLineInfoForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            name: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入条线名称'
                    },
                    stringLength: {
                        max: 100,
                        message: '最多为100个字符'
                    }
                }
            },
            leader: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入负责人ERP'
                    }
                }
            },
            member: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入负责人ERP'
                    }
                }
            },
            description: {
                group: '.col-lg-10',
                validators: {
                    stringLength: {
                        max: 500,
                        message: '最多为500个字符'
                    }
                }
            }
        }
    });
});