@Grab('com.xlson.groovycsv:groovycsv:1.3')
import static com.xlson.groovycsv.CsvParser.parseCsv
 
fh = new File('$WORKSPACE\Input_CaseStudy.csv')
def csv_content = fh.getText('utf-8')
 
def data_iterator = parseCsv(csv_content, separator: ';', readFirstLine: true)

println "final line"
