# Detect4jAgent

[![Build Status](https://app.travis-ci.com/theque5t/Detect4jAgent.svg?branch=main)](https://app.travis-ci.com/github/theque5t/Detect4jAgent)

Agent jar that scans for specific classes in use within the JVM

## Disclaimer

Please read the [license](./LICENSE). This is a work in progress. Best effort was made to test the software, but it is not guaranteed to work perfectly in all contexts. 

```
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

## Requirements

Detect4jAgent requires the following to run:

- JRE 8+

## Installation

1. Download the agent [jar](https://github.com/theque5t/Detect4jAgent/releases) to system that needs to be scanned.
```sh
curl "https://github.com/theque5t/Detect4jAgent/releases/download/v1.0.0-alpha.2/Detect4jAgent-v1.0.0-alpha.2.jar" -o "Detect4jAgent.jar"
```

## Usage

Use this agent with the [Detect4j](https://github.com/theque5t/Detect4j) by following the [usage guide](https://github.com/theque5t/Detect4j#usage).

## Development

### Issue Tracker
Please use the [repo issues](https://github.com/theque5t/Detect4jAgent/issues)

### Builds
* Build using [Gradle](https://gradle.org/). See [build.gradle](./build.gradle) file
* Build locally using the [build.sh](./scripts/build.sh) script
* Remote builds by [Travis CI](https://app.travis-ci.com/github/theque5t/Detect4jAgent)
* Builds served via [repo releases](https://github.com/theque5t/Detect4jAgent/releases)

### Testing
* Follow [Detect4j testing](https://github.com/theque5t/Detect4j#testing)

### Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to test as appropriate.

## License
[MIT License](LICENSE)

## Acknowledgements

Detect4jAgent makes use of the open source projects listed on the [index.md](build/reports/index.md) in the build/reports directory. [Click here](build/reports/index.md) to be automatically redirected to the [index.md](build/reports/index.md).

## Donations

If you'd like to support the development of future projects, or say thanks for this one, you can donate ADA at the following address: `addr1q9xy47gj8nel06azt5mrlr2zwcut9d2m49xp8wmkmuwuml8y0xfqqy3cz50ly3xjc6z7g7cnhta4z9yansz6qzeq7kxstav289`

---

[![Follow on Github](https://img.shields.io/static/v1?label=Follow&message=theque5t&logo=github)](https://github.com/theque5t)
