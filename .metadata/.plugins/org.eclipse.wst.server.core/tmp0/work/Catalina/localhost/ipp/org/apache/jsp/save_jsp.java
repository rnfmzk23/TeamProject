/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.90
 * Generated at: 2023-07-18 02:00:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.*;
import org.apache.commons.fileupload.servlet.*;
import org.apache.commons.io.output.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.MultipartConfig;
import java.io.File;
import java.sql.DriverManager;

public final class save_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("org.apache.commons.fileupload");
    _jspx_imports_packages.add("org.apache.commons.io.output");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("org.apache.commons.fileupload.disk");
    _jspx_imports_packages.add("org.apache.commons.fileupload.servlet");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.annotation.MultipartConfig");
    _jspx_imports_classes.add("java.io.File");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>저장 결과</title>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	flex-direction: column;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	justify-content: center;\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	font-family: Arial, sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".message {\r\n");
      out.write("	font-size: 24px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".error {\r\n");
      out.write("	color: red;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	request.setCharacterEncoding("UTF-8");

    String dbDriver = "com.mysql.jdbc.Driver";
    String jdbcUrl = "jdbc:mysql://192.168.50.52:3306/board";
    String jdbcUsername = "NULL";
    String jdbcPassword = "0000";

	Connection conn = null;
	PreparedStatement pstmt = null;

	File file;
	int maxFileSize = 5000 * 1024;
	int maxMemSize = 5000 * 1024;
	ServletContext context = pageContext.getServletContext();
	String uploadPath = "C:/eGovFrameDev-4.1.0-64bit/workspace/ipp/upload"; // 파일 저장 경로 설정

	// Verify the content type
	String contentType = request.getContentType();

	if (contentType != null && contentType.indexOf("multipart/form-data") >= 0) {
		DiskFileItemFactory factory = new DiskFileItemFactory();
		// maximum size that will be stored in memory
		factory.setSizeThreshold(maxMemSize);

		// Location to save data that is larger than maxMemSize.
		factory.setRepository(new File("c:\\temp"));

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);

		// maximum file size to be uploaded.
		upload.setSizeMax(maxFileSize);

		try {
			// Parse the request to get file items.
			List<FileItem> fileItems = upload.parseRequest(request);

			// Process the uploaded file items
			String fileName = null;
			String filePath = null;

			for (FileItem fileItem : fileItems) {
		if (!fileItem.isFormField()) {
			// Get the uploaded file parameters
			String fieldName = fileItem.getFieldName();
			fileName = fileItem.getName();
			filePath = uploadPath + "/" + fileName;
			boolean isInMemory = fileItem.isInMemory();
			long sizeInBytes = fileItem.getSize();

			// Write the file to the specified path
			fileItem.write(new File(filePath));
		}
			}

			// Save the file information to the database
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);

			String sql = "INSERT INTO board (title, writer, content, file_name, file_path) VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);

			String title = null;
			String writer = null;
			String content = null;

			for (FileItem fileItem : fileItems) {
		if (fileItem.isFormField()) {
			String fieldName = fileItem.getFieldName();
			String fieldValue = fileItem.getString("UTF-8");
			if (fieldName.equals("title")) {
				if (fieldValue == null || fieldValue.isEmpty()) {
					title = "Untitled";
				} else {
					title = fieldValue;
				}
			} else if (fieldName.equals("writer")) {
				if (fieldValue == null || fieldValue.isEmpty()) {
					writer = "Unknown";
				} else {
					writer = fieldValue;
				}
			} else if (fieldName.equals("content")) {
				if (fieldValue == null || fieldValue.isEmpty()) {
					content = "Untitled";
				} else {
					content = fieldValue;
				}
			}
		}
			}

			pstmt.setString(1, title);
			pstmt.setString(2, writer);
			pstmt.setString(3, content);
			pstmt.setString(4, fileName);
			pstmt.setString(5, filePath);

			int rowsAffected = pstmt.executeUpdate();

			if (rowsAffected > 0) {
	
      out.write("\r\n");
      out.write("	<div class=\"message\">글이 성공적으로 저장되었습니다.</div>\r\n");
      out.write("	");

	} else {
	
      out.write("\r\n");
      out.write("	<div class=\"message error\">저장에 실패했습니다.</div>\r\n");
      out.write("	");

	}
	} catch (Exception ex) {
	ex.printStackTrace();
	}
	} else {
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Servlet upload</title>");
	out.println("</head>");
	out.println("<body>");
	out.println("<p>No file uploaded</p>");
	out.println("</body>");
	out.println("</html>");
	}

	try {
	if (pstmt != null)
	pstmt.close();
	if (conn != null)
	conn.close();
	} catch (SQLException e) {
	e.printStackTrace();
	}
	
      out.write("\r\n");
      out.write("	<form method=\"post\" action=\"index.jsp\">\r\n");
      out.write("		<input type=\"submit\" value=\"돌아가기\">\r\n");
      out.write("	</form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
