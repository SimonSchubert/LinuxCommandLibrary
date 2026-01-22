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

**feedreader** is a GUI desktop RSS/Atom feed client. It aggregates news feeds and provides desktop notifications for new articles.

Note: FeedReader is no longer being maintained.

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
