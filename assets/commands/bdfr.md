# TLDR

**Download posts from a subreddit**

```bdfr download [./output] --subreddit [Python] -L [10]```

**Download a user's submitted posts**

```bdfr download [./output] --user [username] --submitted -L [100]```

**Download your saved posts** (requires authentication)

```bdfr download [./output] --user me --saved --authenticate -L [25]```

**Archive submission data** with comments

```bdfr archive [./output] --user [username] --submitted --all-comments```

**Clone posts and data** (download + archive)

```bdfr clone [./output] --subreddit [Python] -L [10]```

**Download from multiple subreddits**

```bdfr download [./output] --subreddit "[Python, programming, linux]" -L [10]```

**Search and download** matching posts

```bdfr download [./output] --subreddit [Python] --search "[machine learning]" -L [20]```

# SYNOPSIS

**bdfr** _mode_ _output_path_ [_options_]

# DESCRIPTION

**bdfr** (Bulk Downloader for Reddit) is a tool to download submissions, media, and data from Reddit. It can archive posts for research, backup saved content, or download media from subreddits.

The tool has three modes: **download** (downloads linked media like images and videos), **archive** (saves submission metadata, text, and comments in JSON/YAML/XML), and **clone** (performs both operations efficiently).

# SUBCOMMANDS

**download**
> Download media linked in Reddit submissions

**archive**
> Archive submission data, metadata, and comments

**clone**
> Perform both download and archive operations

# PARAMETERS

**--subreddit** _name_
> Target subreddit(s), comma-separated for multiple

**--user** _name_
> Target Reddit username; use "me" for authenticated user

**-L, --limit** _n_
> Maximum number of submissions to process

**--submitted**
> Download user's submitted posts

**--saved**
> Download user's saved posts (requires --authenticate)

**--upvoted**
> Download user's upvoted posts (requires --authenticate)

**--authenticate**
> Use OAuth2 authentication for private content

**--search** _query_
> Search query to filter submissions

**-S, --sort** _type_
> Sort order: hot, top, new, controversial, rising, relevance

**-t, --time** _period_
> Time filter: all, hour, day, week, month, year

**--all-comments**
> Archive all comments on submissions

**--file-scheme** _format_
> Custom filename format (e.g., '{POSTID}')

**-v, --verbose**
> Increase output verbosity

# CAVEATS

Requires Python 3.9 or above. Authentication is required for accessing saved posts, upvoted posts, and private multireddits. Reddit API rate limits apply. Some media hosts may block automated downloads.

# HISTORY

BDFR was created as a modernized fork of earlier Reddit downloading tools, developed by **Serene-Arc** starting around **2020**. It replaced the original Bulk Downloader for Reddit with improved architecture and maintained compatibility with Reddit's evolving API.

# SEE ALSO

[gallery-dl](/man/gallery-dl)(1), [youtube-dl](/man/youtube-dl)(1), [wget](/man/wget)(1)
