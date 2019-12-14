$(document).ready(function() {
    $('#systemInfoForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            sysCode: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入系统英文名'
                    },
                    stringLength: {
                        max: 200,
                        message: '最多为200个字符'
                    }
                }
            },
            sysName: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入系统中文名'
                    },
                    stringLength: {
                        max: 200,
                        message: '最多为200个字符'
                    }
                }
            },
            lineId: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请选择业务条线'
                    }
                }
            },
            manager: {
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