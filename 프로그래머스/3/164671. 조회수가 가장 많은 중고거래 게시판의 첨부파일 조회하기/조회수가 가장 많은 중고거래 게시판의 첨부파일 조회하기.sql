SELECT '/home/grep/src/' || board_id || '/' || file_id || file_name || file_ext AS file_path
  FROM used_goods_file
 WHERE board_id = (SELECT board_id
                      FROM (SELECT board_id, views
                              FROM used_goods_board
                             ORDER BY views DESC
                             FETCH FIRST 1 ROWS ONLY))
 ORDER BY file_id DESC;