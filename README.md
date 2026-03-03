# outln

CLI to print concise file outlines for source files.

You can read about this cli here: [https://blog.fooqux.com/blog/outline-oriented-codebase/](https://blog.fooqux.com/blog/outline-oriented-codebase/)

## Install

```bash
npm i -g outln
```

## Usage

```bash
outln <file-path> [file-path...]
```

### File mode

Generate full outlines for one or more files:

```bash
outln src/main.ts
outln src/main.ts src/core/formatter.ts
```

### Glob mode

Generate compact one-line summaries per matching file:

```bash
outln src
outln "src/**/*.ts"
outln "src/**/*.{ts,tsx,js}"
```

### Debug mode

Show source text with ANSI highlighting for extracted outline:

```bash
outln --debug src/main.ts
outln --debug src
```

## Supported file types

- TypeScript: `.ts`, `.tsx`, `.mts`, `.cts`, `.d.ts`
- JavaScript: `.js`, `.jsx`, `.mjs`, `.cjs`
- Markdown: `.md`
- Go: `.go`
- Rust: `.rs`
- Java: `.java`
- Kotlin: `.kt`, `.kts`
- C#: `.cs`
