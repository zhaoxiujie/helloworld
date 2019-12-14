$(document).ready(function() {
    $('#interfaceInfoForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            interfaceName: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入接口名'
                    },
                    stringLength: {
                        max: 200,
                        message: '最多为200个字符'
                    }
                }
            },
            serviceName: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入接口中文名'
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
                        message: '请选择所属条线'
                    }
                }
            },
            systemId: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请选择所属系统'
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
            }
        }
    });

    $('#httpInfoForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            interfaceName: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入接口URL'
                    },
                    stringLength: {
                        max: 200,
                        message: '最多为200个字符'
                    }
                }
            },
            serviceName: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入接口中文名'
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
                        message: '请选择所属条线'
                    }
                }
            },
            systemId: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请选择所属系统'
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
            }
        }
    });

    $('#jsfInfoForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            interfaceName: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请输入接口名'
                    },
                    stringLength: {
                        max: 200,
                        message: '最多为200个字符'
                    }
                }
            },
            serviceName: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请输入接口中文名'
                    },
                    stringLength: {
                        max: 200,
                        message: '最多为200个字符'
                    }
                }
            },
            lineId: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择所属条线'
                    }
                }
            },
            systemId: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请选择所属系统'
                    }
                }
            },
            manager: {
                group: '.col-lg-5',
                validators: {
                    notEmpty: {
                        message: '请输入负责人ERP'
                    }
                }
            }
        }
    });

    $('#methodInfoForm').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            methodDesc: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请输入方法中文名'
                    },
                    stringLength: {
                        max: 200,
                        message: '最多为200个字符'
                    }
                }
            },
            note: {
                group: '.col-lg-10',
                validators: {
                    stringLength: {
                        max: 200,
                        message: '最多为200个字符'
                    }
                }
            },
            type: {
                group: '.col-lg-10',
                validators: {
                    notEmpty: {
                        message: '请选择方法类型'
                    }
                }
            }
        }
    });
});