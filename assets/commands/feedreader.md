# TAGLINE

desktop RSS/Atom news aggregator

# TLDR

Print count of **unread** articles

```feedreader --unreadCount```

**Add** a feed URL

```feedreader --addFeed=[feed_url]```

**Grab** a specific article

```feedreader --grabArticle=[article_url]```

Download **images** from article

```feedreader --url=[feed_url] --grabImages=[article_path]```

**Play** media from URL

```feedreader --playMedia=[article_url]```

# SYNOPSIS

**feedreader** [_options_]

# DESCRIPTION

**feedreader** is a GUI desktop RSS/Atom feed client built with GTK. It aggregates news feeds from multiple sources and provides desktop notifications for new articles, allowing users to read content in a unified interface.

The application supports various feed services including Feedly, Inoreader, and local feed reading. It offers features like article synchronization, tagging, and full-text search across feed content.

Note: FeedReader is no longer being maintained. Users are encouraged to migrate to actively developed alternatives like NewsFlash or Akregator.

# PARAMETERS

**--unreadCount**
> Show unread article count

**--addFeed** _url_
> Add feed subscription

**--grabArticle** _url_
> Download specific article

**--grabImages** _path_
> Download article images

**--playMedia** _url_
> Play media content

# CAVEATS

Project is no longer maintained. Consider alternatives like Newsflash or Akregator. Supports various feed services like Feedly and Inoreader.

# SEE ALSO

[newsboat](/man/newsboat)(1), [liferea](/man/liferea)(1)
