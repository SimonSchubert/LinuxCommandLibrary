# TAGLINE

Wikipedia search and pages as an MCP server

# TLDR

**Serve** Wikipedia over stdio

```janas-wiki```

Register with **Claude Code**

```claude mcp add wiki -- /path/to/janas-wiki```

# SYNOPSIS

**janas-wiki**

# DESCRIPTION

**janas-wiki** is a Janas service: an MCP server over standard input and output for Wikipedia, used when someone asks for Wikipedia or for what is around a place. No key. **janas-chat** starts it by itself when the binary sits in `services/` beside the packaged program, or in the same directory.

Tools, each with a `language` (the user's Wikipedia, then English if that one has nothing; if the model omits it, `LANG` is used, else English):

- **wiki_search** — matching pages, best first, title plus Wikidata's one-line description
- **wiki_page** — the page for the user: a short page whole, a long page as its introduction plus section names, or one section by name or the start of the name. A section over 10,000 characters is cut at a paragraph and the answer names the parts. A redirect is followed and said. A disambiguation page comes back as the list it points to. The model receives a note (address, how many words were shown, the sections), not the article
- **wiki_nearby** — pages about what lies around a place, nearest first, with distance and direction, within up to 10 km. The place is a page title (the page's coordinates), `lat,lon`, or nothing, which means where the user is

The page and the note are separate MCP audiences. **janas-chat** shows the user's part as it is and gives the model only the note. A client that ignores audience gives the model both.

Text comes from each Wikipedia's MediaWiki Action API (TextExtracts and GeoData). It is plain text: tables and infoboxes are not included. The text is Wikipedia's, under CC BY-SA 4.0, and every answer includes the page address. Requests use `janas-wiki/<version> (https://github.com/prabanta-dev/janas)`, one at a time, and answers are kept for an hour. Location with no place uses GeoJS, then ipwho.is, as **janas-weather** does. Logs go to standard error.

# PARAMETERS

**-h**, **--help**
> Print usage and exit 0. Any other argument exits 2.

# CONFIGURATION

**JANAS_LOCATION**
> City, `lat,lon`, or `off`, for **wiki_nearby** with no place.

**LANG**
> Wikipedia language when the client does not pass one (`it_IT.UTF-8` selects `it`).

# CAVEATS

This is an MCP **server**, not a prompt. **--no-services** or **--no-mcp** on **janas-chat** skips it. An `mcpServers` entry named `wiki` in `~/.config/janas/mcp.json` replaces the automatic start.

The model is told to open Wikipedia only when the user asks for it, or asks what is around a place, and not to call other Janas services because a page names a town. It is also told that Wikipedia is not a source for what happened today. A page shown to the user is not repeated to the model, so the model cannot quote lines it was not given.

# HISTORY

**janas-wiki** ships with **Janas**, written by **Maurizio "camauri" Cammalleri** (GNU GPL 3 or later). The first public Janas-LLM release was in **September 2026**.

# SEE ALSO

[janas-chat](/man/janas-chat)(1), [janas-maps](/man/janas-maps)(1), [janas-mcp](/man/janas-mcp)(1), [claude](/man/claude)(1)

# RESOURCES

```[Source code](https://github.com/prabanta-dev/janas)```

```[Documentation](https://github.com/prabanta-dev/janas/blob/main/src/services/wiki/README.md)```

<!-- verified: 2026-10-23 -->
