/**
 * Created by hanwei3 on 2017/3/28.
 */
// Success alert
function alertSuccess(message) {
    swal({
        title: "Good job!",
        text: message,
        confirmButtonColor: "#66BB6A",
        type: "success"
    });
}

// Error alert
function alertError(message) {
    swal({
        title: "Oops...",
        text: message,
        confirmButtonColor: "#EF5350",
        type: "error"
    });
}

// Waring alert
function alertWarning(message, confirmFun) {
    swal({
        title: "确定操作吗？",
        text: message,
        type: "warning",
        showCancelButton: true,
        confirmButtonColor: "#DD6B55",
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        closeOnConfirm: false,
        closeOnCancel: true
    },
    function(isConfirm){
        if (isConfirm) {
            confirmFun();
        }
    });
}

function alertBasic(message){
    swal({
        title: message,
        confirmButtonColor: "#2196F3"
    });
}

//通用方法
function CommonUtils(){}
CommonUtils.prototype = {};

//div load
CommonUtils.loadHtml = function (divId, url) {
    $("#"+divId).load(url);
}

//菜单栏加载请求
CommonUtils.navBarLoad = function(url){
    CommonUtils.loadHtml("main-content" ,url);
}

// Format displayed data
function formatRepo (repo) {
    if (repo.loading) return "正在搜索......";
    var markup = "<div class='select2-result-repository clearfix'>" +
        "<div class='select2-result-repository__avatar'><img src='" + repo.headImg+ "' /></div>" +
        "<div class='select2-result-repository__meta'>" +
        "<div class='select2-result-repository__title'>"+repo.name+"/"+repo.erp+"</div>";

    if (repo.email) {
        markup += "<div class='select2-result-repository__description'>"+repo.email+"</div>";
    }

    markup += "<div class='select2-result-repository__statistics'>" +
        "<div class='select2-result-repository__forks'>"+repo.organizationName+"</div>" +
        "</div>" +
        "</div></div>"; //拼装组织机构
    return markup;
}

// Format selection
function formatRepoSelection (repo) {
    // alert(repo.text);
    if(repo.erp != undefined && repo.name != undefined){
        return repo.erp+"("+repo.name+")";
    }
    return repo.text;
}

function initErp(){
    // Initialize
    $(".select-remote-data").select2({
        ajax: {
            url: "/findUser",
            dataType: 'json',
            delay: 250,
            data: function (params) {
                return {
                    erp: params.term, // search term
                    page: params.page
                };
            },
            processResults: function (data, params) {
                // parse the results into the format expected by Select2
                // since we are using custom formatting functions we do not need to
                // alter the remote JSON data, except to indicate that infinite
                // scrolling can be used
                params.page = params.page || 1;
                data.items.forEach(function(result){
                    if(!result.id){
                        result.id = result.erp;
                    }
                });
                return {
                    results: data.items,
                    pagination: {
                        more: (params.page * 30) < data.total_count
                    }
                };
            },
            cache: true
        },
        escapeMarkup: function (markup) { return markup; }, // let our custom formatter work
        minimumInputLength: 2,
        templateResult: formatRepo, // omitted for brevity, see the source of this page
        templateSelection: formatRepoSelection // omitted for brevity, see the source of this page
    });
}

function blockUI(block,message){
    if(!message){
        message='Loading...';
    }
    $(block).block({
        message: '<span class="text-semibold"><i class="icon-spinner4 spinner position-left"></i>&nbsp; '+message+'</span>',
        timeout: 20000,
        overlayCSS: {
            backgroundColor: '#fff',
            opacity: 0.8,
            cursor: 'wait'
        },
        css: {
            border: 0,
            padding: '10px 15px',
            color: '#fff',
            width: 'auto',
            '-webkit-border-radius': 2,
            '-moz-border-radius': 2,
            backgroundColor: '#333'
        }
    });
}

function unblockUI(block){
    $(block).unblock();
}

function buttonLoad(btn){
    btn.button('loading');
}
function buttonReset(btn){
    btn.button('reset');
}

function dateAdd(interval, number, date) {
    switch (interval) {
        case "y": {
            date.setFullYear(date.getFullYear() + number);
            return date;
            break;
        }
        case "q": {
            date.setMonth(date.getMonth() + number * 3);
            return date;
            break;
        }
        case "m": {
            date.setMonth(date.getMonth() + number);
            return date;
            break;
        }
        case "w": {
            date.setDate(date.getDate() + number * 7);
            return date;
            break;
        }
        case "d": {
            date.setDate(date.getDate() + number);
            return date;
            break;
        }
        case "h": {
            date.setHours(date.getHours() + number);
            return date;
            break;
        }
        case "m": {
            date.setMinutes(date.getMinutes() + number);
            return date;
            break;
        }
        case "s": {
            date.setSeconds(date.getSeconds() + number);
            return date;
            break;
        }
        default: {
            date.setDate(d.getDate() + number);
            return date;
            break;
        }
    }
}