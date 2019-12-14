$(document).ready(function() {
    $('#caseInfoForm').bootstrapValidator({
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
                        message: '请输入用例名称'
                    },
                    stringLength: {
                        max: 100,
                        message: '最多为100个字符'
                    }
                }
            },
            caseType: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请选择用例类型'
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
/*
    $('#caseSelectForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            caseSuite: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请选择用例集'
                    }
                }
            },
            caseInfo: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请选择用例'
                    }
                }
            },
            caseDetail: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请选择用例明细'
                    }
                }
            }
        }
    });*/
});