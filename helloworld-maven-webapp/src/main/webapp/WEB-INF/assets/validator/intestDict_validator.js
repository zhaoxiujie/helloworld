$(document).ready(function() {
    $('#intestDictForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            type: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请选择类型'
                    }
                }
            },
            name: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入名称'
                    },
                    stringLength: {
                        max: 100,
                        message: '最多为100个字符'
                    }
                }
            },
            code: {
                group: '.col-lg-10',
                validators: {
                    stringLength: {
                        max: 100,
                        message: '最多为100个字符'
                    }
                }
            },
            note: {
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