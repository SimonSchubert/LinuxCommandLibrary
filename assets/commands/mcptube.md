# TAGLINE

YouTube video knowledge engine with transcripts and vision

# TLDR

**Add** a YouTube video to the library

```mcptube add "[youtube_url]"```

**Add** a video in text-only mode (no frame extraction)

```mcptube add "[youtube_url]" --text-only```

**List** all videos in the library

```mcptube list```

**Search** across video transcripts

```mcptube search "[query]"```

**Ask a question** about video content

```mcptube ask "[question]"```

**Generate a report** on a specific topic

```mcptube report [video_query] --focus "[topic]"```

**Export the wiki** as a single HTML file

```mcptube wiki export --format html -o [wiki.html]```

**Start** the MCP server

```mcptube serve --stdio```

# SYNOPSIS

**mcptube** \<command\> [_options_]

# PARAMETERS

**add** _url_ [_--text-only_]
> Add a YouTube video to the library; use --text-only to skip frame extraction

**remove** _query_
> Remove a video from the library

**list**
> List all videos in the library

**info** _query_
> Show detailed information about a video

**search** _query_ [_-n limit_]
> Full-text search of the wiki knowledge base (default limit: 10)

**ask** _question_
> Ask a natural language question about video content

**frame** _query_ _timestamp_
> Extract a frame at a specific timestamp

**frame-query** _query_ _description_
> Extract a frame by transcript match

**classify** _query_
> Classify video content

**report** _query_ [_--focus topic_] [_--format html_] [_-o file_]
> Generate a report about a video

**report-query** _topic_ [_--tag tag_] [_--format html_] [_-o file_]
> Generate a report across videos by topic

**synthesize-cmd** _topic_ _-v video_... [_--format html_] [_-o file_]
> Synthesize themes across the given videos

**discover** _topic_
> Search YouTube and cluster results without ingesting them

**wiki list** [_--type type_] [_--tag tag_]
> List wiki pages

**wiki show** _slug_
> Display a wiki page

**wiki search** _query_
> Search wiki content

**wiki toc**
> Show wiki table of contents

**wiki history** _slug_
> Show the version history of a wiki page

**wiki export** [_--format markdown|html|pdf_] [_--page slug_] [_-o path_]
> Export wiki pages (default: Markdown into `wiki_export`)

**serve** [_--stdio_] [_--host host_] [_--port port_] [_--reload_]
> Start the MCP server over HTTP (default: 127.0.0.1:9093), or over stdio with --stdio

# DESCRIPTION

**mcptube** is a YouTube video knowledge engine that extracts metadata, transcripts, and frames from YouTube videos, indexes them for semantic search, and exposes everything as both a CLI tool and an MCP (Model Context Protocol) server.

The tool builds a persistent wiki knowledge base that grows richer with each video ingested, rather than treating videos as isolated searchable chunks. It uses **scene-change detection** instead of fixed-interval sampling to capture high-information-density frames. Search combines FTS5 keyword matching with LLM-powered reasoning for hybrid retrieval.

mcptube operates in two modes: **CLI mode** using your own API keys (Anthropic, OpenAI, or Google) for deterministic results, and **MCP passthrough mode** where the connected AI assistant analyzes data using its own model, avoiding double-billing.

# CAVEATS

Requires **Python 3.12 or 3.13** (ChromaDB is not compatible with Python 3.14) and **ffmpeg** for frame extraction. Full feature set requires API keys from at least one LLM provider (Anthropic, OpenAI, or Google). The MCP server is currently local-only. Text-only mode is available for cost reduction when vision features are not needed.

# HISTORY

mcptube was created by **0xchamin** and written in **Python**. It evolved from a simple transcript search tool into a full video knowledge engine with wiki capabilities, vision-based frame analysis, and MCP server integration for use with AI coding assistants.

# SEE ALSO

[yt-dlp](/man/yt-dlp)(1), [ffmpeg](/man/ffmpeg)(1), [youtube-dl](/man/youtube-dl)(1)

# RESOURCES

```[Source code](https://github.com/0xchamin/mcptube)```

```[Homepage](https://0xchamin.github.io/mcptube/)```

<!-- verified: 2026-11-09 -->
