# TAGLINE

Web interface for browsing Git repositories

# TLDR

**Start development server**

```git instaweb --httpd=[webrick]```

**Configure gitweb**

```git config --global instaweb.httpd [webrick]```

# SYNOPSIS

**gitweb** _cgi_

# DESCRIPTION

**gitweb** is a web interface for Git repositories. It provides a CGI script that displays repository contents, commits, branches, and diffs through a web browser.

**gitweb** is typically deployed with a web server (Apache, nginx) for shared repository browsing. It shows commit history, file contents, blame annotations, and search functionality.

# CONFIGURATION

**/etc/gitweb.conf**
> Main configuration file specifying project root, site name, and display options.

# CAVEATS

CGI script, needs web server. No authentication built-in. Read-only interface.

# HISTORY

gitweb is part of the **Git** distribution, providing web repository browsing since Git's early versions. It is the predecessor to modern git hosting interfaces.

# SEE ALSO

[git-instaweb](/man/git-instaweb)(1), [gitea](/man/gitea)(1)
