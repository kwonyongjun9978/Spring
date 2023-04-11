$('#writeBtn').click(function(){
   $('#nameDiv').empty();
   $('#idDiv').empty();
   $('#pwdDiv').empty();
   
   if($('#name').val() == ''){
      $('#nameDiv').text('이름 입력');
      $('#nameDiv').focus();
   }
   else if($('#id').val() == ''){
      $('#idDiv').text('아이디 입력');
      $('#idDiv').focus();
   }
   else if($('#pwd').val() == ''){
      $('#pwdDiv').text('비밀번호 입력');
      $('#pwdDiv').focus();
   }
   });