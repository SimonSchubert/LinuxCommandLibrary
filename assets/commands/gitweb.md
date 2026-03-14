# TAGLINE

Web interface for browsing Git repositories

# TLDR

**Start a quick local gitweb** server with git instaweb

```git instaweb --httpd=[webrick]```

**Stop the instaweb** server

```git instaweb --stop```

**Configure gitweb** project root

```git config --global instaweb.httpd [webrick]```

# SYNOPSIS

**gitweb** _cgi_

# DESCRIPTION

**gitweb** is a web interface for Git repositories, implemented as a Perl CGI script. It provides browsing of repository contents, commit history, branches, tags, diffs, blame annotations, and search functionality through a web browser.

**gitweb** is typically deployed behind a web server (Apache, nginx, lighttpd) for shared repository browsing. For quick local browsing, use **git instaweb** which starts a temporary web server automatically. The configuration file uses Perl syntax to set variables controlling display and behavior.

# CONFIGURATION

**/etc/gitweb.conf**
> System-wide configuration file specifying project root, site name, and display options.

**gitweb_config.perl**
> Per-instance configuration file (in same directory as gitweb CGI script), takes precedence over /etc/gitweb.conf.

# CAVEATS

CGI script, requires a web server for production use. No authentication built-in; rely on web server authentication. Read-only interface; cannot push or modify repositories.

# HISTORY

gitweb is part of the **Git** distribution, providing web repository browsing since Git's early versions. It is the predecessor to modern git hosting interfaces like Gitea and GitLab.

# SEE ALSO

[git-instaweb](/man/git-instaweb)(1), [gitea](/man/gitea)(1)
