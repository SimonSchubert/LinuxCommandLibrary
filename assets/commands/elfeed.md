# TAGLINE

Extensible RSS/Atom feed reader for Emacs

# TLDR

**Open Elfeed in Emacs**

```M-x elfeed```

**Update all feeds**

```M-x elfeed-update```

**Set default search filter**

```(setq elfeed-search-filter "@6-months-ago +unread")```

**Add feeds in config**

```(setq elfeed-feeds '("https://example.com/feed.xml" "https://blog.example.org/rss"))```

# DESCRIPTION

**Elfeed** is an extensible RSS/Atom feed reader for Emacs. It provides a fast, keyboard-driven interface for reading and managing feeds, with support for tagging, searching, and customization through Emacs Lisp.

Elfeed stores feed data in a local database and supports thousands of feeds efficiently. It integrates with Emacs features like org-mode and can display feed content using eww or external browsers.

# EMACS CONFIGURATION

```elisp
;; Add feeds
(setq elfeed-feeds
      '("https://news.ycombinator.com/rss"
        "https://planet.emacslife.com/atom.xml"
        ("https://example.com/blog" blog tech)))

;; With elfeed-org (org-mode integration)
(elfeed-org)
(setq rmh-elfeed-org-files '("~/.emacs.d/elfeed.org"))
```

# KEYBINDINGS

```
g         - Refresh view
G         - Update all feeds
s         - Edit search filter
b         - Open entry in browser
r         - Mark as read (remove unread tag)
u         - Mark as unread
+         - Add tag
-         - Remove tag
RET       - Open selected entry
n / p     - Next / previous entry
q         - Quit elfeed or close entry
```

# CONFIGURATION

**~/.emacs.d/init.el** or **~/.emacs**
> Configure feeds and settings using Emacs Lisp (setq elfeed-feeds).

**~/.elfeed/** (default database location)
> Local feed database and cached entries.

**~/.emacs.d/elfeed.org** (with elfeed-org)
> Org-mode file for managing feeds when using elfeed-org integration.

# CAVEATS

Emacs-only application. Requires Emacs 24.3+. Large numbers of feeds may slow initial sync. No mobile sync (use elfeed-protocol for Fever/NewsBlur). Learning curve for Emacs users unfamiliar with feeds.

# HISTORY

Elfeed was created by **Christopher Wellons** (skeeto) around **2013**. It was designed as a lightweight, Emacs-native feed reader that leverages Emacs's strengths in text processing and extensibility.

# SEE ALSO

[emacs](/man/emacs)(1), [newsboat](/man/newsboat)(1)
