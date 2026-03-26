# TAGLINE

Desktop RSS/Atom news aggregator

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

**Run** with verbose debug output

```feedreader --verbose```

# SYNOPSIS

**feedreader** [_options_]

# DESCRIPTION

**feedreader** is a GTK desktop RSS/Atom feed client. It aggregates news feeds from multiple sources and provides desktop notifications for new articles. The application supports various feed services including Feedly, Inoreader, and local feed reading, with features like article synchronization, tagging, and full-text search.

Note: FeedReader is no longer being maintained. Users are encouraged to migrate to actively developed alternatives like NewsFlash.

# PARAMETERS

**--unreadCount**
> Show current count of unread articles in the database.

**--addFeed**=_URL_
> Add the feed to the collection.

**--grabArticle**=_URL_
> Use the ContentGrabber to grab the given URL.

**--grabImages**=_PATH_
> Download all images of the html-document.

**--url**=_URL_
> URL of the article needed for grabImages.

**--playMedia**=_URL_
> Start media player with the given URL.

**--ping**=_URL_
> Test the ping function with the given URL.

**--verbose**
> Output all debug information.

**--about**
> Show the about dialog.

**--version**
> Show FeedReader version number.

# CAVEATS

Project is no longer maintained. Consider alternatives like NewsFlash. Supports various feed services like Feedly and Inoreader.

# SEE ALSO

[newsboat](/man/newsboat)(1)
