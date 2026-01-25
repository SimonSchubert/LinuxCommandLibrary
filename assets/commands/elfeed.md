# TLDR

**Open Elfeed in Emacs**

```M-x elfeed```

**Update feeds**

```M-x elfeed-update```

**Add feed (in config)**

```(setq elfeed-feeds '("https://example.com/feed.xml"))```

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
g         - Update feeds
G         - Update all feeds
s         - Search/filter
b         - Open in browser
r         - Mark as read
u         - Mark as unread
+         - Add tag
-         - Remove tag
q         - Quit
```

# CAVEATS

Emacs-only application. Requires Emacs 24.3+. Large numbers of feeds may slow initial sync. No mobile sync (use elfeed-protocol for Fever/NewsBlur). Learning curve for Emacs users unfamiliar with feeds.

# HISTORY

Elfeed was created by **Christopher Wellons** (skeeto) around **2013**. It was designed as a lightweight, Emacs-native feed reader that leverages Emacs's strengths in text processing and extensibility.

# SEE ALSO

[emacs](/man/emacs)(1), [newsboat](/man/newsboat)(1), [rss](/man/rss)(5)
