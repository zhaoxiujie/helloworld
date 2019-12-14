$(document).ready(function() {
    $('#caseDetailForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            name: {
                group: '.col-lg-5',
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
            lineId: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择业务条线'
                    }
                }
            },
            systemId: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择业务系统'
                    }
                }
            },
            interfaceName: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择接口'
                    }
                }
            },
            alias: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择别名'
                    }
                }
            },
            methodName: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择方法名'
                    }
                }
            },
            ipPort: {
                group: '.col-lg-9',
                validators: {
                    notEmpty: {
                        message: '请选择ip:port'
                    },
                    stringLength: {
                        max: 2000,
                        message: '最多为2000个字符'
                    }
                }
            }
        }
    });

    $('#httpCaseDetailForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            name: {
                group: '.col-lg-5',
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
            lineId: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择业务条线'
                    }
                }
            },
            systemId: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择业务系统'
                    }
                }
            },
            interfaceName: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择接口'
                    }
                }
            },
            ipPort: {
                group: '.col-lg-5',
                validators: {
                    stringLength: {
                        max: 2000,
                        message: '最多为2000个字符'
                    }
                }
            }
        }
    });
});