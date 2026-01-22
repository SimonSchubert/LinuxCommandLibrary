# TLDR

**Start development server**

```git instaweb --httpd=[webrick]```

**Configure gitweb**

```git config --global instaweb.httpd [webrick]```

# SYNOPSIS

**gitweb** _cgi_

# DESCRIPTION

**gitweb** is a web interface for git repositories. It provides a CGI script that displays repository contents, commits, branches, and diffs through a web browser.

Gitweb is typically deployed with a web server (Apache, nginx) for shared repository browsing. It shows commit history, file contents, blame, and search functionality.

gitweb provides web-based git repository browsing.

# CAVEATS

CGI script, needs web server. No authentication built-in. Read-only interface.

# HISTORY

gitweb is part of the **Git** distribution, providing web repository browsing since Git's early versions. It's the predecessor to modern git hosting interfaces.

# SEE ALSO

[git-instaweb](/man/git-instaweb)(1), [gitea](/man/gitea)(1)
