<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@include file="/WEB-INF/includes/taglibs.jsp"%>

<c:set var="formMethod"
	value="${empty param.formMethod ? 'post' : param.formMethod}" />
<c:set var="formAction"
	value="${empty param.formAction ? '' : param.formAction}" />
<c:set var="formButtonLabel"
	value="${empty param.formButtonLabel ? 'SAVE' : param.formButtonLabel}" />

<div class="box box-danger">
	<div class="box-header">
		<div class="box-body pull-left">
			<h3 class="box-title">Options</h3>
		</div>
		<div class="box-body pull-right">
			<button type="submit" class="btn btn-primary">
				<span class="glyphicon glyphicon-ok"></span>
				<c:out value="${formButtonLabel}" />
			</button>
			<button type="submit" class="btn btn-primary">
				<span class="glyphicon glyphicon-remove"></span> CANCEL
			</button>
		</div>
	</div>
</div>


<!-- /.box-body -->
<div class="row">
	<!-- left column -->
	<div class="col-md-6">
		<!-- general form elements -->
		<div class="box box-primary">
			<div class="box-header">
				<h3 class="box-title">Basic Data Book</h3>
			</div>
			<!-- /.box-header -->
			<!-- form start -->
			<form:form method="${formMethod}" action="${formAction}"
				commandName="book" role="form">
				<div class="box-body">
					<div class="form-group">
						<form:label path="name" cssClass="control-label">Title</form:label>
						<form:input path="name" cssClass="form-control"
							placeholder="Title" />
						<form:errors path="name" cssClass="alert alert-warning" />
					</div>
					<div class="form-group">
						<form:label path="author" cssClass="control-label">Author</form:label>
						<form:input path="author" cssClass="form-control"
							placeholder="Author" />
						<form:errors path="author" cssClass="alert alert-warning" />
					</div>
					<div class="form-group">
						<form:label path="" cssClass="control-label">Catalog number</form:label>
						<form:input path="" cssClass="form-control"
							placeholder="Catalog number" />
						<form:errors path="" cssClass="alert alert-warning" />
					</div>
					<div class="form-group">
						<label>Cover type</label> <select class="form-control">
							<option>Soft</option>
							<option>Hard</option>
						</select>
					</div>
					<div class="form-group">
						<label>Carrier</label> <select class="form-control">
							<option>Print</option>
							<option>eBook</option>
						</select>
					</div>
					<div class="form-group">
						<form:label path="" cssClass="control-label">Number of pages</form:label>
						<form:input path="" cssClass="form-control"
							placeholder="Number of pages" />
						<form:errors path="" cssClass="alert alert-warning" />
					</div>
				</div>
				<!-- /.box-body -->

				<div class="box-footer"></div>
			</form:form>
		</div>
		<!-- /.box -->
		<!-- Input addon -->
		<div class="box box-info">
			<div class="box-header">
				<h3 class="box-title">Additional Data</h3>
			</div>
			<!-- /.box-header -->
			<!-- form start -->
			<form:form method="${formMethod}" action="${formAction}"
				commandName="book" role="form">
				<div class="box-body">
					<div class="form-group">
						<form:label path="" cssClass="control-label">Publishing house</form:label>
						<form:input path="" cssClass="form-control"
							placeholder="Publishing house" />
						<form:errors path="" cssClass="alert alert-warning" />
					</div>
					<div class="form-group">
						<form:label path="" cssClass="control-label">ISBN</form:label>
						<form:input path="" cssClass="form-control" placeholder="ISBN" />
						<form:errors path="" cssClass="alert alert-warning" />
					</div>

				</div>
				<!-- /.box-body -->
				<!-- /.box-body -->
			</form:form>
		</div>
		<!-- /.box -->

	</div>
	<!--/.col (left) -->
	<!--************************************************************************************************************************!-->
	<!-- right column -->
	<div class='col-md-6'>
		<div class='box box-warning'>
			<div class='box-header'>
				<h3 class='box-title'>
					Description <small>Book</small>
				</h3>
			</div>
			<!-- /.box-header -->
			<div class='box-body pad'>
				<form:form method="${formMethod}" action="${formAction}"
					commandName="book" role="form">
					<form:textarea path="" cssClass="textarea"
						placeholder="Place some text here"
						style="width: 100%; height: 200px; font-size: 14px; line-height: 18px; border: 1px solid #dddddd; padding: 10px;" />
				</form:form>
			</div>
		</div>
		<!-- Form Element sizes -->
		<div class="box box-success">
			<div class="box-header">
				<h3 class="box-title">
					Images Cover <small>Book</small>
				</h3>
			</div>
			<div class="box-body">
				<div class="row">
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail"> <img
							src="/resources/image/book_cover/test.png" alt="">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail"> <img
							src="/resources/image/book_cover/test.png" alt="">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail"> <img
							src="/resources/image/book_cover/test.png" alt="">
						</a>
					</div>
					<div class="col-xs-6 col-md-3">
						<a href="#" class="thumbnail"> <img
							src="/resources/image/book_cover/test.png" alt="">
						</a>
					</div>
				</div>
			</div>
			<!-- /.box-body -->
		</div>
		<!-- /.box -->


	</div>
	<!-- /.col-->
</div>
<!-- ./row -->





<!--/.col (right) -->

<!-- /.row -->


<!-- Bootstrap WYSIHTML5 -->
<!-- bootstrap wysihtml5 - text editor -->
<script type="text/javascript">
	$(function() {
		//bootstrap WYSIHTML5 - text editor
		$(".textarea").wysihtml5();
	});
</script>







