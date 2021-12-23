package com.angular.application.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author MadhanRandy
 *
 */
@Repository
@Transactional
public class DAORepository implements IDAORepository {

	@Autowired
	private NamedParameterJdbcTemplate namedjdbctemplate;

	@Autowired
	private JdbcTemplate jdbctemplate;

	@Override
	public <T> List<T> queryForList(String sql, Map<String, Object> params, Class<T> type) {
		return this.namedjdbctemplate.queryForList(sql, params, type);
	}

	@Override
	public List<Map<String, Object>> queryForList(String sql, Map<String, Object> params) {
		return this.namedjdbctemplate.queryForList(sql, params);
	}

	@Override
	public List<Map<String, Object>> queryForList(String sql, Object... params) {
		return this.jdbctemplate.queryForList(sql, params);
	}

	@Override
	public <T> List<T> queryForList(String sql, Class<T> clazz, Object... params) {
		return this.jdbctemplate.queryForList(sql, clazz, params);
	}

	@Override
	public Map<String, Object> queryForMap(String sql, Object... params) {
		return this.jdbctemplate.queryForMap(sql, params);
	}

	@Override
	public <T> T queryForObject(String sql, Map<String, Object> params, Class<T> type) {
		return this.namedjdbctemplate.queryForObject(sql, params, type);
	}

	@Override
	public <T> T queryForObject(String sql, Class<T> clazz, Object... params) {
		return this.jdbctemplate.queryForObject(sql, clazz, params);
	}

	@Override
	public <T> T queryForObjectWithRowMapper(String sql, Class<T> clazz, Object... params) {
		return this.jdbctemplate.queryForObject(sql, params, new BeanPropertyRowMapper<>(clazz));
	}

	@Override
	public <T> List<T> query(String sql, Class<T> clazz, Object... params) {
		return this.jdbctemplate.query(sql, new BeanPropertyRowMapper<>(clazz), params);
	}

	@Override
	public <T> List<T> query(String sql, Map<String, Object> params, Class<T> clazz) {
		return this.namedjdbctemplate.query(sql, params, new BeanPropertyRowMapper<>(clazz));
	}

	@Override
	public void batchUpdate(String sql, List<Map<String, Object>> data) {
		Map<String, Object>[] params = data.toArray(new Map[0]);
		this.namedjdbctemplate.batchUpdate(sql, params);
	}

	@Override
	public void update(String sql, List<Object[]> data) {
		this.jdbctemplate.batchUpdate(sql, data);
	}

	@Override
	public void update(String sql, Map<String, Object> data) {
		this.namedjdbctemplate.update(sql, data);
	}

	@Override
	public void update(String sql, Object... params) {
		this.jdbctemplate.update(sql, params);

	}

	@Override
	public void execute(String sql) {
		this.jdbctemplate.execute(sql);

	}

	@Transactional
	@Override
	public void updateWithParams(String sql, Object[] params) {
		this.namedjdbctemplate.batchUpdate(sql, SqlParameterSourceUtils.createBatch(params));
	}

	@Override
	public void save(String sql, List list) {
		SqlParameterSource[] batch = SqlParameterSourceUtils.createBatch(list.toArray());
		this.namedjdbctemplate.batchUpdate(sql, batch);
	}

}
